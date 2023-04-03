package eventplanner.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QVendor is a Querydsl query type for Vendor
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QVendor extends EntityPathBase<Vendor> {

    private static final long serialVersionUID = -704939005L;

    public static final QVendor vendor = new QVendor("vendor");

    public final StringPath address = createString("address");

    public final StringPath email = createString("email");

    public final NumberPath<Integer> idVendor = createNumber("idVendor", Integer.class);

    public final NumberPath<Integer> number = createNumber("number", Integer.class);

    public final StringPath password = createString("password");

    public QVendor(String variable) {
        super(Vendor.class, forVariable(variable));
    }

    public QVendor(Path<? extends Vendor> path) {
        super(path.getType(), path.getMetadata());
    }

    public QVendor(PathMetadata metadata) {
        super(Vendor.class, metadata);
    }

}

