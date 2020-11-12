package strategy;

/**
 * 鸟类训练类
 * 继承自TrainingStrategy接口
 * 实例化鸟类训练方法
 */
public class BirdTraining implements TrainingStrategy{
    @Override
    public void trainingAlgorithm() {
        System.out.println("This bird is training for flying competition!");
    }
}
