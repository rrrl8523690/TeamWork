package bsonobject;

import org.bson.BasicBSONObject;
import org.bson.types.ObjectId;

import java.util.ArrayList;

/**
 * Created by whd on 2014/12/1.
 */
//TODO complete
/*
*
* Team = {
*       name : "",
*       memberList  : [member1OjbectId, member2ObjectId, ...]
*       messageList : [message1, message2 ...]
* }
*
* */
public class Team extends BasicBSONObject {
    private String name;
    private ArrayList<ObjectId> memberList;

}
