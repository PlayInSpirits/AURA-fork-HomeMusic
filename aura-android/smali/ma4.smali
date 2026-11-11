.class public final synthetic Lma4;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lif1;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lna4;

.field public final synthetic p:Lcom/eddyizm/tempus/model/Server;


# direct methods
.method public synthetic constructor <init>(Lna4;Lcom/eddyizm/tempus/model/Server;I)V
    .locals 0

    .line 1
    iput p3, p0, Lma4;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lma4;->o:Lna4;

    .line 4
    .line 5
    iput-object p2, p0, Lma4;->p:Lcom/eddyizm/tempus/model/Server;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lma4;->n:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, Lma4;->p:Lcom/eddyizm/tempus/model/Server;

    .line 5
    .line 6
    iget-object p0, p0, Lma4;->o:Lna4;

    .line 7
    .line 8
    check-cast p1, Lx34;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, Lna4;->q:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Lh61;

    .line 16
    .line 17
    invoke-virtual {p0, p1, v2}, Lsi0;->y(Lx34;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-object v1

    .line 21
    :pswitch_0
    iget-object p0, p0, Lna4;->p:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p0, Lh61;

    .line 24
    .line 25
    invoke-virtual {p0, p1, v2}, Lsi0;->y(Lx34;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    return-object v1

    .line 29
    :pswitch_1
    iget-object p0, p0, Lna4;->o:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p0, Lq20;

    .line 32
    .line 33
    invoke-virtual {p0, p1, v2}, Lau0;->I(Lx34;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    return-object v1

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
