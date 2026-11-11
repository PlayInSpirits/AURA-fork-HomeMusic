.class public final Loa4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final o:Lna4;

.field public final p:Lcom/eddyizm/tempus/model/Server;


# direct methods
.method public synthetic constructor <init>(Lna4;Lcom/eddyizm/tempus/model/Server;I)V
    .locals 0

    .line 1
    iput p3, p0, Loa4;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Loa4;->o:Lna4;

    .line 4
    .line 5
    iput-object p2, p0, Loa4;->p:Lcom/eddyizm/tempus/model/Server;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget v0, p0, Loa4;->n:I

    .line 2
    .line 3
    iget-object v1, p0, Loa4;->p:Lcom/eddyizm/tempus/model/Server;

    .line 4
    .line 5
    iget-object p0, p0, Loa4;->o:Lna4;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lna4;->n:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Ls24;

    .line 15
    .line 16
    new-instance v4, Lma4;

    .line 17
    .line 18
    const/4 v5, 0x2

    .line 19
    invoke-direct {v4, p0, v1, v5}, Lma4;-><init>(Lna4;Lcom/eddyizm/tempus/model/Server;I)V

    .line 20
    .line 21
    .line 22
    invoke-static {v0, v3, v2, v4}, Lxl;->E(Ls24;ZZLif1;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_0
    iget-object v0, p0, Lna4;->n:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Ls24;

    .line 29
    .line 30
    new-instance v4, Lma4;

    .line 31
    .line 32
    invoke-direct {v4, p0, v1, v3}, Lma4;-><init>(Lna4;Lcom/eddyizm/tempus/model/Server;I)V

    .line 33
    .line 34
    .line 35
    invoke-static {v0, v3, v2, v4}, Lxl;->E(Ls24;ZZLif1;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :pswitch_1
    iget-object v0, p0, Lna4;->n:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v0, Ls24;

    .line 42
    .line 43
    new-instance v4, Lma4;

    .line 44
    .line 45
    invoke-direct {v4, p0, v1, v2}, Lma4;-><init>(Lna4;Lcom/eddyizm/tempus/model/Server;I)V

    .line 46
    .line 47
    .line 48
    invoke-static {v0, v3, v2, v4}, Lxl;->E(Ls24;ZZLif1;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    nop

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
