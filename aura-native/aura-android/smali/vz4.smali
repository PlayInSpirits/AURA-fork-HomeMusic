.class public final Lvz4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final a:[Ljava/lang/reflect/Type;

.field public final b:Z


# direct methods
.method public constructor <init>([Ljava/lang/reflect/Type;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lvz4;->a:[Ljava/lang/reflect/Type;

    .line 5
    .line 6
    iput-boolean p2, p0, Lvz4;->b:Z

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/reflect/Type;)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lvz4;->a:[Ljava/lang/reflect/Type;

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    iget-boolean v3, p0, Lvz4;->b:Z

    .line 6
    .line 7
    if-ge v2, v1, :cond_1

    .line 8
    .line 9
    aget-object v4, v0, v2

    .line 10
    .line 11
    invoke-static {v4}, Lcom/google/common/reflect/TypeToken;->of(Ljava/lang/reflect/Type;)Lcom/google/common/reflect/TypeToken;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    invoke-virtual {v4, p1}, Lcom/google/common/reflect/TypeToken;->isSubtypeOf(Ljava/lang/reflect/Type;)Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    if-ne v4, v3, :cond_0

    .line 20
    .line 21
    return v3

    .line 22
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    xor-int/lit8 p0, v3, 0x1

    .line 26
    .line 27
    return p0
.end method
