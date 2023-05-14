import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;

import com.codeborne.selenide.Condition;
import org.junit.Test;


//
public class HomeWork4 {
    @Test
    //ტესტ მეთოდი 1 - დადებითი მნიშვნელობები
    public void GGG(){
        open("https://ee.ge/");
        $(byText("რეგისტრაცია")).click();
        $(byText("სწრაფი რეგისტრაცია")).shouldBe(Condition.visible);
        $(byId("firstName")).setValue("Beqa").shouldNot(Condition.empty);
        $(byId("lastName")).setValue("Gugushvili").shouldNot(Condition.empty);
        $(byId("email")).setValue("gugushvilibeqa@gmail.com").shouldNot(Condition.empty);
        $(byId("password")).setValue("Giorgi1").shouldBe(Condition.visible);
        $(byId("confirmPassword")).setValue("Giorgi1").shouldBe(Condition.visible);
        $(byId("singup")).shouldBe(Condition.enabled);
    }

    @Test
    //ტესტ მეთოდი 2 - ნეგატიური მნიშვნელობები
    public void HHH(){
        open("https://ee.ge/");
        $(byText("რეგისტრაცია")).click();
        $(byText("სწრაფი რეგისტრაცია")).shouldBe(Condition.visible);
        $(byId("singup")).shouldBe(Condition.disabled);
        $(byId("firstName")).click();
        $(byId("lastName")).click();
        $(byText("სახელი სავალდებულოა")).shouldBe(Condition.visible);
        $(byId("email")).click();
        $(byText("გვარი სავალდებულოა")).shouldBe(Condition.visible);
        $(byId("password")).click();
        $(byText("ელ. ფოსტა სავალდებულოა")).shouldBe(Condition.visible);
        $(byId("confirmPassword")).click();
        $(byText("პაროლი სავალდებულოა.")).shouldBe(Condition.visible);
        $(byId("firstName")).click();
        $(byText("პაროლის გამეორება სავალდებულოა")).shouldBe(Condition.visible);
        $(byId("email")).setValue("545454");
        $(byText("ელ. ფოსტა სავალდებულოა")).shouldBe(Condition.visible);
        $(byId("password")).setValue("66666666");
        $(byText("პაროლი სავალდებულოა.")).shouldNot(Condition.visible);
        $(byId("confirmPassword")).setValue("55555555");
        $(byText("პაროლის გამეორება სავალდებულოა")).shouldBe(Condition.visible);

    }
}