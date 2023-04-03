package eventplanner.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QVendorServices is a Querydsl query type for VendorServices
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QVendorServices extends EntityPathBase<VendorServices> {

    private static final long serialVersionUID = -476299903L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QVendorServices vendorServices = new QVendorServices("vendorServices");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final QServices services;

    public final QVendor vendor;

    public QVendorServices(String variable) {
        this(VendorServices.class, forVariable(variable), INITS);
    }

    public QVendorServices(Path<? extends VendorServices> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QVendorServices(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QVendorServices(PathMetadata metadata, PathInits inits) {
        this(VendorServices.class, metadata, inits);
    }

    public QVendorServices(Class<? extends VendorServices> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.services = inits.isInitialized("services") ? new QServices(forProperty("services")) : null;
        this.vendor = inits.isInitialized("vendor") ? new QVendor(forProperty("vendor")) : null;
    }

}

