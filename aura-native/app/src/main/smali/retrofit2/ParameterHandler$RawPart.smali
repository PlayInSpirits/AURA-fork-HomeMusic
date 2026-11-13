.class final Lretrofit2/ParameterHandler$RawPart;
.super Lretrofit2/ParameterHandler;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lretrofit2/ParameterHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "RawPart"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lretrofit2/ParameterHandler<",
        "Ldefpackage/vz2;",
        ">;"
    }
.end annotation


# static fields
.field static final INSTANCE:Lretrofit2/ParameterHandler$RawPart;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lretrofit2/ParameterHandler$RawPart;

    .line 2
    .line 3
    invoke-direct {v0}, Lretrofit2/ParameterHandler$RawPart;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lretrofit2/ParameterHandler$RawPart;->INSTANCE:Lretrofit2/ParameterHandler$RawPart;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lretrofit2/ParameterHandler;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public bridge synthetic apply(Lretrofit2/RequestBuilder;Ljava/lang/Object;)V
    .locals 0
    .param p2    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    check-cast p2, Ldefpackage/vz2;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lretrofit2/ParameterHandler$RawPart;->apply(Lretrofit2/RequestBuilder;Ldefpackage/vz2;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public apply(Lretrofit2/RequestBuilder;Ldefpackage/vz2;)V
    .locals 0
    .param p2    # Ldefpackage/vz2;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    if-eqz p2, :cond_0

    .line 7
    invoke-virtual {p1, p2}, Lretrofit2/RequestBuilder;->addPart(Ldefpackage/vz2;)V

    :cond_0
    return-void
.end method
