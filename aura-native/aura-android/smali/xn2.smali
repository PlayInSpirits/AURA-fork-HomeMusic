.class public final synthetic Lxn2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lbj2;

.field public final synthetic p:I

.field public final synthetic q:I

.field public final synthetic r:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lbj2;IILjava/util/ArrayList;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lxn2;->n:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lxn2;->o:Lbj2;

    .line 8
    .line 9
    iput p2, p0, Lxn2;->p:I

    .line 10
    .line 11
    iput p3, p0, Lxn2;->q:I

    .line 12
    .line 13
    iput-object p4, p0, Lxn2;->r:Ljava/util/List;

    .line 14
    .line 15
    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Lbj2;II)V
    .locals 1

    .line 16
    const/4 v0, 0x0

    iput v0, p0, Lxn2;->n:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxn2;->r:Ljava/util/List;

    iput-object p2, p0, Lxn2;->o:Lbj2;

    iput p3, p0, Lxn2;->p:I

    iput p4, p0, Lxn2;->q:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget v0, p0, Lxn2;->n:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, Lxn2;->r:Ljava/util/List;

    .line 5
    .line 6
    iget v3, p0, Lxn2;->q:I

    .line 7
    .line 8
    iget v4, p0, Lxn2;->p:I

    .line 9
    .line 10
    iget-object p0, p0, Lxn2;->o:Lbj2;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast v2, Ljava/util/ArrayList;

    .line 16
    .line 17
    add-int/2addr v3, v1

    .line 18
    invoke-virtual {p0, v4, v3}, Lsk2;->P(II)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2, v4, v3}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {p0, v0}, Lsk2;->w0(Ljava/util/List;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_0
    invoke-static {v2}, Lgi1;->M(Ljava/util/List;)Ljava/util/ArrayList;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    new-instance v5, Landroid/os/Handler;

    .line 34
    .line 35
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    invoke-direct {v5, v6}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 40
    .line 41
    .line 42
    new-instance v6, Lxn2;

    .line 43
    .line 44
    invoke-direct {v6, p0, v4, v3, v0}, Lxn2;-><init>(Lbj2;IILjava/util/ArrayList;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v5, v6}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 48
    .line 49
    .line 50
    new-instance p0, Lvs3;

    .line 51
    .line 52
    invoke-direct {p0}, Lvs3;-><init>()V

    .line 53
    .line 54
    .line 55
    const/4 v0, 0x0

    .line 56
    invoke-virtual {p0, v2, v1, v0}, Lvs3;->c(Ljava/util/List;ZI)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    nop

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
