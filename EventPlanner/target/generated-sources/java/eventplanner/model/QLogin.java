package eventplanner.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QLogin is a Querydsl query type for Login
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QLogin extends EntityPathBase<Login> {

    private static final long serialVersionUID = -1555704498L;

    public static final QLogin login = new QLogin("login");

    public final StringPath mailid = createString("mailid");

    public final NumberPath<Integer> mobileno = createNumber("mobileno", Integer.class);

    public final StringPath name = createString("name");

    public QLogin(String variable) {
        super(Login.class, forVariable(variable));
    }

    public QLogin(Path<? extends Login> path) {
        super(path.getType(), path.getMetadata());
    }

    public QLogin(PathMetadata metadata) {
        super(Login.class, metadata);
    }

}

