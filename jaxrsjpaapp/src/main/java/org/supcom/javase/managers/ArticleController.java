import org.supcom.javase.managers.BaseManager;
import org.supcom.javase.models.article;

import java.util.*;

/**
 * Controller is a class that contains all the methods that can modify the Article entity in the database
 * @author Imen Mhiri, Rania Jarraya, Mohamed Ouassim Slimi
 */
public class articleManager extends BaseManager<Integer,article > {

    /**
     * Default constructor
     */
    public articleManager() {
    }

    /**
     * 
     */
    public Article  Article;

    /**
     * 
     */
    public UI_EditArticle UI_EditArticle;

    /**
     * Adds an article in the database.
     * @param articleName Commercial name of the addedArticle
     * @param articleQuantity Quantity of the added article
     * @param articlePrice Unique price of the added article
     */
    public void addArticle(String articleName, float articleQuantity, float articlePrice) {
        // TODO implement here
    }

    /**
     * Modify an article in the database.
     * @param articleID Indentificator of the modified article
     */
    public void modifyArticle(int articleID) {
        // TODO implement here
    }

    /**
     * Deletes an exisisting article in the database.
     * @param articleID Identificator of the deleted article
     */
    public void deleteArticle(int articleID) {
        // TODO implement here
    }

    /**
     * Displays article details.
     * @param articleID Identificator of the consulted article
     */
    public void consultArticle(int articleID) {
        // TODO implement here
    }

}
