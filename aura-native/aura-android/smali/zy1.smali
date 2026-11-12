.class public final Lzy1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lb75;


# instance fields
.field public final a:[Lz65;


# direct methods
.method public varargs constructor <init>([Lz65;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lzy1;->a:[Lz65;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Class;Lf03;)Lx65;
    .locals 4

    .line 1
    invoke-static {p1}, Lkx3;->a(Ljava/lang/Class;)Li30;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p0, p0, Lzy1;->a:[Lz65;

    .line 6
    .line 7
    array-length p2, p0

    .line 8
    invoke-static {p0, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, [Lz65;

    .line 13
    .line 14
    array-length p2, p0

    .line 15
    const/4 v0, 0x0

    .line 16
    :goto_0
    const/4 v1, 0x0

    .line 17
    if-ge v0, p2, :cond_1

    .line 18
    .line 19
    aget-object v2, p0, v0

    .line 20
    .line 21
    iget-object v3, v2, Lz65;->a:Li30;

    .line 22
    .line 23
    invoke-virtual {v3, p1}, Li30;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-eqz v3, :cond_0

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    move-object v2, v1

    .line 34
    :goto_1
    if-eqz v2, :cond_2

    .line 35
    .line 36
    new-instance p0, Lrd1$a;

    .line 37
    .line 38
    invoke-direct {p0}, Lrd1$a;-><init>()V

    .line 39
    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_2
    move-object p0, v1

    .line 43
    :goto_2
    if-eqz p0, :cond_3

    .line 44
    .line 45
    return-object p0

    .line 46
    :cond_3
    invoke-virtual {p1}, Li30;->b()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    const-string p1, "No initializer set for given class "

    .line 51
    .line 52
    invoke-static {p1, p0}, Lxa3;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-static {p0}, Lkf2;->e(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    return-object v1
.end method
