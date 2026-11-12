.class public final Lzp;
.super Lpm0;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# virtual methods
.method public final a(Landroid/content/Context;)Ltj0;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p0, Lau;

    .line 5
    .line 6
    invoke-direct {p0, p1}, Lau;-><init>(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    sget-object p1, Ljz3;->e:Liz3;

    .line 10
    .line 11
    filled-new-array {p1}, [Liz3;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, [Lim;

    .line 16
    .line 17
    new-instance v0, Lqp4;

    .line 18
    .line 19
    invoke-direct {v0, p1}, Lqp4;-><init>([Lim;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lau;->d:Ljava/lang/Object;

    .line 23
    .line 24
    invoke-virtual {p0}, Lau;->b()Ltj0;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method
