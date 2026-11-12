.class public final synthetic Lls3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lif1;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lns3;

.field public final synthetic p:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lns3;Ljava/util/List;I)V
    .locals 0

    .line 1
    iput p3, p0, Lls3;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lls3;->o:Lns3;

    .line 4
    .line 5
    iput-object p2, p0, Lls3;->p:Ljava/util/List;

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
    .locals 4

    .line 1
    iget v0, p0, Lls3;->n:I

    .line 2
    .line 3
    iget-object v1, p0, Lls3;->p:Ljava/util/List;

    .line 4
    .line 5
    iget-object p0, p0, Lls3;->o:Lns3;

    .line 6
    .line 7
    check-cast p1, Lx34;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, Lns3;->p:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Lq20;

    .line 15
    .line 16
    invoke-virtual {p0, p1, v1}, Lau0;->H(Lx34;Ljava/lang/Iterable;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    iget-object p1, p0, Lns3;->o:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p1, Ls24;

    .line 24
    .line 25
    new-instance v0, Lk52;

    .line 26
    .line 27
    const/16 v2, 0x1d

    .line 28
    .line 29
    invoke-direct {v0, v2}, Lk52;-><init>(I)V

    .line 30
    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    const/4 v3, 0x1

    .line 34
    invoke-static {p1, v2, v3, v0}, Lxl;->E(Ls24;ZZLif1;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    new-instance v0, Lls3;

    .line 38
    .line 39
    invoke-direct {v0, p0, v1, v3}, Lls3;-><init>(Lns3;Ljava/util/List;I)V

    .line 40
    .line 41
    .line 42
    invoke-static {p1, v2, v3, v0}, Lxl;->E(Ls24;ZZLif1;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    sget-object p0, Lj15;->a:Lj15;

    .line 46
    .line 47
    return-object p0

    .line 48
    nop

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
