import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.yandex.praktikum.Account;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AccountNameTest {

    private final String name;
    private final boolean expectedResponse;

    public AccountNameTest(String name, boolean expectedResponse) {
        this.name = name;
        this.expectedResponse = expectedResponse;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][]{
                {"T M", true},
                {"ТимотиТим ШаламеШал", true},
                {"Тимоти Шаламе", true},
                {"Ти", false},
                {"ТимотиТимотиТимотиТи", false},
                {"Тим  Ша", false},
                {" Тим", false},
                {"Тим ", false},
                {"", false},
                {null, false}
        };
    }

    @Test
    public void accountNameLengthTest() {
        Account account = new Account(name);
        boolean actualResponse = account.checkNameToEmboss();
        assertEquals(expectedResponse, actualResponse);
    }

}
