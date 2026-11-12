.class public abstract enum Lr05;
.super Ljava/lang/Enum;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final n:Lr05;

.field public static final synthetic o:[Lr05;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Lo05;

    .line 2
    .line 3
    invoke-direct {v0}, Lo05;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lp05;

    .line 7
    .line 8
    invoke-direct {v1}, Lp05;-><init>()V

    .line 9
    .line 10
    .line 11
    const/4 v2, 0x2

    .line 12
    new-array v2, v2, [Lr05;

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    aput-object v0, v2, v3

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    aput-object v1, v2, v0

    .line 19
    .line 20
    sput-object v2, Lr05;->o:[Lr05;

    .line 21
    .line 22
    const-class v0, Lq05;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Class;->getGenericSuperclass()Ljava/lang/reflect/Type;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Ljava/lang/reflect/ParameterizedType;

    .line 29
    .line 30
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    invoke-static {}, Lr05;->values()[Lr05;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    array-length v4, v2

    .line 38
    :goto_0
    if-ge v3, v4, :cond_1

    .line 39
    .line 40
    aget-object v5, v2, v3

    .line 41
    .line 42
    invoke-virtual {v5, v0}, Lr05;->a(Ljava/lang/Class;)Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    invoke-interface {v1}, Ljava/lang/reflect/ParameterizedType;->getOwnerType()Ljava/lang/reflect/Type;

    .line 47
    .line 48
    .line 49
    move-result-object v7

    .line 50
    if-ne v6, v7, :cond_0

    .line 51
    .line 52
    sput-object v5, Lr05;->n:Lr05;

    .line 53
    .line 54
    return-void

    .line 55
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    new-instance v0, Ljava/lang/AssertionError;

    .line 59
    .line 60
    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    .line 61
    .line 62
    .line 63
    throw v0
.end method

.method public static valueOf(Ljava/lang/String;)Lr05;
    .locals 1

    .line 1
    const-class v0, Lr05;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lr05;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lr05;
    .locals 1

    .line 1
    sget-object v0, Lr05;->o:[Lr05;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lr05;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lr05;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public abstract a(Ljava/lang/Class;)Ljava/lang/Class;
.end method
