package homework2;
//Реализовать класс Market и все методы, которые он обязан реализовывать.
//        Методы из интерфейса QueueBehaviour, имитируют работу очереди,
//        MarketBehaviour – помещает и удаляет человека из очереди,
//        метод update – обновляет состояние магазина (принимает и отдаёт заказы)
public class Market implements IQueueBehaviour, IMarketBehaviour{

    @Override
    public void updateInventory() {
        System.out.println("Sending request to update inventory");
        addToInventory();
    }

    @Override
    public void checkInventory() {
        boolean isTrue=true;
        if (isTrue){
            updateInventory();
        }
        else System.out.println("Everything is in order");
    }

    @Override
    public void sellItem() {
        System.out.println("Selling item");
        removePersonFromQueue();
        removeFromInventory();
    }

    @Override
    public void removeFromInventory() {
        System.out.println("Removing an item from inventory");
    }

    @Override
    public void addToInventory() {
        System.out.println("Adding an item from inventory");
    }

    @Override
    public void addPersonToQueue() {
        System.out.println("Adding a person to queue");
    }

    @Override
    public void removePersonFromQueue() {
        System.out.println("Removing a person from queue");
    }

    @Override
    public void checkQueue() {
        System.out.println("Checking if there are people in queue");
    }
}
