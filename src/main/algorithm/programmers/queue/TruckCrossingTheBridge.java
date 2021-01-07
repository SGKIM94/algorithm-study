package algorithm.programmers.queue;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 프로그래머스
 * 큐
 * TruckCrossingTheBridge
 */
public class TruckCrossingTheBridge {
    public int solution(int bridgeLength, int weight, int[] truckWeights) {
        int answer = 0;

        if (truckWeights.length == 1) {
            return bridgeLength + 1;
        }

        Queue<Truck> ofTruckWeights = new ArrayDeque<>();

        for (int truckWeight : truckWeights) {
            ofTruckWeights.add(new Truck(truckWeight));
        }

        Truck firstTruck = ofTruckWeights.poll();
        int crossingBridgeWeight = firstTruck.getWeight();

        Queue<Truck> crossingTheBridge = new ArrayDeque<>();
        crossingTheBridge.add(firstTruck);

        while (!ofTruckWeights.isEmpty() || !crossingTheBridge.isEmpty()) {
            answer++;
            Truck currentTruck = ofTruckWeights.peek();

            for (Truck truck : crossingTheBridge) {
                truck.addDuration();

                if (truck.getDuration() == bridgeLength) {
                    Truck removeTruck = crossingTheBridge.poll();
                    crossingBridgeWeight -= removeTruck.getWeight();

                }
            }

            if (currentTruck != null && crossingBridgeWeight + currentTruck.getWeight() <= weight) {
                crossingTheBridge.add(ofTruckWeights.poll());
                crossingBridgeWeight += currentTruck.getWeight();
            }
        }

        return answer + 1;
    }

    static class Truck {
        private int weight;
        private int duration;

        Truck(int weight) {
            this.weight = weight;
            this.duration = 0;
        }

        int getWeight() {
            return weight;
        }

        int getDuration() {
            return duration;
        }

        void addDuration() {
            this.duration += 1;
        }
    }
}
