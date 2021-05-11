package tests.massageTest.WriteMassage;

import org.testng.annotations.Test;
import tests.massageTest.DelateMassage.PageDelateMassage;

public class TestPrivateMassage extends PageDelateMassage {
    @Test(priority = 1)
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

        //Проверить сообщеие
        heckLastMassage();
    }
}
