package LR11.Part2.Exersize8;

public class TailCreateNodeList {
    public static NodeList TailCreateNodeList(int size) {
        //добавление элементов с перемещением головы (наращивание головы)
    NodeList list = new NodeList(); // Инициализация односвязного списка
        for (int i = 0; i < size; i++) {
            list = InsertNodeList.insert(list, i);
        }
        return list;
    }
}
