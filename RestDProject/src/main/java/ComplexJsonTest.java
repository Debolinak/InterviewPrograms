import files.Payload;
import io.restassured.path.json.JsonPath;

public class ComplexJsonTest {
    //1. Print No of courses returned by API
    // 2.Print Purchase Amount
   //3. Print Title of the first course
   //4. Print All course titles and their respective Prices
  //5. Print no of copies sold by RPA Course
  //6. Verify if Sum of all Course prices matches with Purchase Amount
    public static void main(String[] args) {
        JsonPath js = new JsonPath(Payload.complexJson());
        int courseSize = js.getInt("courses.size()");
        System.out.println("Course size is" + courseSize);
        int purchaseAmount = js.getInt("dashboard.purchaseAmount");
        System.out.println("Purchase Amount is"+ purchaseAmount);
        String firstTitle = js.get("courses[0].title");
        System.out.println("First Title is"+firstTitle);
        int sum= 0;
        for(int i = 0 ; i <courseSize ; i++ )
        {
            String title = js.get("courses["+i+"].title");
            System.out.println("The title is"+ title);
            int price = js.getInt("courses["+i+"].price");
            int copies = js.getInt("courses["+i+"].copies");

            sum = sum + (price* copies);
            System.out.println("The price is"+ price);
            if(title.equalsIgnoreCase("RPA"))
            {
               int copiesRPA =  js.getInt("courses["+i+"].copies");
                System.out.println("Copies for RPA is"+copiesRPA);
            }

        }
        System.out.println("The sum is "+ sum);
        if(sum == purchaseAmount)
        {
            System.out.println("The sum "+ sum + " matches the purchase amount" + purchaseAmount);
        }
    }
}
