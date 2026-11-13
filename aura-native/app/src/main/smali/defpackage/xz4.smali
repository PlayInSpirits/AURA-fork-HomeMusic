.class public final enum Ldefpackage/xz4;
.super Ldefpackage/zz4;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const-string v0, "IGNORE_TYPE_VARIABLE_OR_WILDCARD"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {p0, v0, v1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, Lcom/google/common/reflect/TypeToken;

    .line 2
    .line 3
    invoke-static {p1}, Lcom/google/common/reflect/TypeToken;->access$500(Lcom/google/common/reflect/TypeToken;)Ljava/lang/reflect/Type;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    instance-of p0, p0, Ljava/lang/reflect/TypeVariable;

    .line 8
    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    invoke-static {p1}, Lcom/google/common/reflect/TypeToken;->access$500(Lcom/google/common/reflect/TypeToken;)Ljava/lang/reflect/Type;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    instance-of p0, p0, Ljava/lang/reflect/WildcardType;

    .line 16
    .line 17
    if-nez p0, :cond_0

    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    return p0

    .line 21
    :cond_0
    const/4 p0, 0x0

    .line 22
    return p0
.end method
