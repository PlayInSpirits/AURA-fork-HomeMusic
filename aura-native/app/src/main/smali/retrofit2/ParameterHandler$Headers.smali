.class final Lretrofit2/ParameterHandler$Headers;
.super Lretrofit2/ParameterHandler;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lretrofit2/ParameterHandler;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Headers"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lretrofit2/ParameterHandler<",
        "Ldefpackage/tl1;",
        ">;"
    }
.end annotation


# instance fields
.field private final method:Ljava/lang/reflect/Method;

.field private final p:I


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Method;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lretrofit2/ParameterHandler;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lretrofit2/ParameterHandler$Headers;->method:Ljava/lang/reflect/Method;

    .line 5
    .line 6
    iput p2, p0, Lretrofit2/ParameterHandler$Headers;->p:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public bridge synthetic apply(Lretrofit2/RequestBuilder;Ljava/lang/Object;)V
    .locals 0
    .param p2    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 21
    check-cast p2, Ldefpackage/tl1;

    invoke-virtual {p0, p1, p2}, Lretrofit2/ParameterHandler$Headers;->apply(Lretrofit2/RequestBuilder;Ldefpackage/tl1;)V

    return-void
.end method

.method public apply(Lretrofit2/RequestBuilder;Ldefpackage/tl1;)V
    .locals 1
    .param p2    # Ldefpackage/tl1;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Lretrofit2/RequestBuilder;->addHeaders(Ldefpackage/tl1;)V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    iget-object p1, p0, Lretrofit2/ParameterHandler$Headers;->method:Ljava/lang/reflect/Method;

    .line 8
    .line 9
    iget p0, p0, Lretrofit2/ParameterHandler$Headers;->p:I

    .line 10
    .line 11
    const/4 p2, 0x0

    .line 12
    new-array p2, p2, [Ljava/lang/Object;

    .line 13
    .line 14
    const-string v0, "Headers parameter must not be null."

    .line 15
    .line 16
    invoke-static {p1, p0, v0, p2}, Lretrofit2/Utils;->parameterError(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    throw p0
.end method
