package tests.massageTest.DelateMassage;
import org.testng.annotations.Test;


public class TestDelateMassage  extends PageDelateMassage {
    @Test(priority = 2)
    public void writePersonalMassge() {

        //Провеить id пользователя
        checkIdAdres();

        //Проверить имя пользователя
        checkName();

        //нажать на категорию месенджкр
        goToMassanger();

        //Найти пользователя по имени
        findeUser();

        //Перейти к диалогу с прользователем
        goToUserDialog();

        //Ввести сообщение в поле и отправить
        writeSendMassage();
        writeSendMassages();

        //Проверить сообщеие
        heckLastMassage();

        clickMassge();

        //Удалить последнее сообщение
        delateMassage();
        //Убедится что сообщение удалено
        heckDelate();

    }
}
