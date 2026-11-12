.class public final Lhh0;
.super Lep4;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lwf1;


# instance fields
.field public final synthetic o:I

.field public synthetic p:Ljava/lang/Object;

.field public final synthetic q:Lif1;


# direct methods
.method public synthetic constructor <init>(Lvd0;Lif1;I)V
    .locals 0

    .line 1
    iput p3, p0, Lhh0;->o:I

    .line 2
    .line 3
    iput-object p2, p0, Lhh0;->q:Lif1;

    .line 4
    .line 5
    const/4 p2, 0x2

    .line 6
    invoke-direct {p0, p2, p1}, Lep4;-><init>(ILvd0;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lvd0;)Lvd0;
    .locals 2

    .line 1
    iget v0, p0, Lhh0;->o:I

    .line 2
    .line 3
    iget-object p0, p0, Lhh0;->q:Lif1;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, Lhh0;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p2, p0, v1}, Lhh0;-><init>(Lvd0;Lif1;I)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, Lhh0;->p:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, Lhh0;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p2, p0, v1}, Lhh0;-><init>(Lvd0;Lif1;I)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, Lhh0;->p:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lhh0;->o:I

    .line 2
    .line 3
    sget-object v1, Lj15;->a:Lj15;

    .line 4
    .line 5
    check-cast p1, Lao3;

    .line 6
    .line 7
    check-cast p2, Lvd0;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1, p2}, Lhh0;->create(Ljava/lang/Object;Lvd0;)Lvd0;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lhh0;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lhh0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lhh0;->create(Ljava/lang/Object;Lvd0;)Lvd0;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lhh0;

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Lhh0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lhh0;->o:I

    .line 2
    .line 3
    iget-object v1, p0, Lhh0;->q:Lif1;

    .line 4
    .line 5
    invoke-static {p1}, Lkb4;->X(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lhh0;->p:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, Lao3;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    check-cast p0, Lqu3;

    .line 19
    .line 20
    invoke-interface {p0}, Lqu3;->c()Lx34;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-interface {v1, p0}, Lif1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :pswitch_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    check-cast p0, Lqu3;

    .line 33
    .line 34
    invoke-interface {p0}, Lqu3;->c()Lx34;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-interface {v1, p0}, Lif1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
