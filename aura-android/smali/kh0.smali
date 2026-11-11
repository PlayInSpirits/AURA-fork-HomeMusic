.class public final Lkh0;
.super Lep4;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lwf1;


# instance fields
.field public o:I

.field public final synthetic p:Ls24;

.field public final synthetic q:Z

.field public final synthetic r:Lif1;


# direct methods
.method public constructor <init>(Lvd0;Lif1;Ls24;Z)V
    .locals 0

    .line 1
    iput-object p3, p0, Lkh0;->p:Ls24;

    .line 2
    .line 3
    iput-boolean p4, p0, Lkh0;->q:Z

    .line 4
    .line 5
    iput-object p2, p0, Lkh0;->r:Lif1;

    .line 6
    .line 7
    const/4 p2, 0x2

    .line 8
    invoke-direct {p0, p2, p1}, Lep4;-><init>(ILvd0;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvd0;)Lvd0;
    .locals 2

    .line 1
    new-instance p1, Lkh0;

    .line 2
    .line 3
    iget-boolean v0, p0, Lkh0;->q:Z

    .line 4
    .line 5
    iget-object v1, p0, Lkh0;->r:Lif1;

    .line 6
    .line 7
    iget-object p0, p0, Lkh0;->p:Ls24;

    .line 8
    .line 9
    invoke-direct {p1, p2, v1, p0, v0}, Lkh0;-><init>(Lvd0;Lif1;Ls24;Z)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lwe0;

    .line 2
    .line 3
    check-cast p2, Lvd0;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lkh0;->create(Ljava/lang/Object;Lvd0;)Lvd0;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lkh0;

    .line 10
    .line 11
    sget-object p1, Lj15;->a:Lj15;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lkh0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lkh0;->o:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    if-ne v0, v2, :cond_0

    .line 8
    .line 9
    invoke-static {p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-object p1

    .line 13
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 14
    .line 15
    invoke-static {p0}, Lkf2;->o(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-object v1

    .line 19
    :cond_1
    invoke-static {p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    new-instance p1, Lmh0;

    .line 23
    .line 24
    iget-object v0, p0, Lkh0;->r:Lif1;

    .line 25
    .line 26
    iget-object v3, p0, Lkh0;->p:Ls24;

    .line 27
    .line 28
    iget-boolean v4, p0, Lkh0;->q:Z

    .line 29
    .line 30
    invoke-direct {p1, v1, v0, v3, v4}, Lmh0;-><init>(Lvd0;Lif1;Ls24;Z)V

    .line 31
    .line 32
    .line 33
    iput v2, p0, Lkh0;->o:I

    .line 34
    .line 35
    invoke-virtual {v3, v4, p1, p0}, Ls24;->u(ZLwf1;Lwd0;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    sget-object p1, Lxe0;->n:Lxe0;

    .line 40
    .line 41
    if-ne p0, p1, :cond_2

    .line 42
    .line 43
    return-object p1

    .line 44
    :cond_2
    return-object p0
.end method
