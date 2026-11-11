.class public final synthetic Lx85;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final synthetic p:Z

.field public final synthetic q:Z

.field public final synthetic r:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/util/concurrent/atomic/AtomicBoolean;ZZI)V
    .locals 0

    .line 1
    iput p5, p0, Lx85;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lx85;->r:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lx85;->o:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 6
    .line 7
    iput-boolean p3, p0, Lx85;->p:Z

    .line 8
    .line 9
    iput-boolean p4, p0, Lx85;->q:Z

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Lx85;->n:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-boolean v2, p0, Lx85;->q:Z

    .line 5
    .line 6
    iget-boolean v3, p0, Lx85;->p:Z

    .line 7
    .line 8
    iget-object v4, p0, Lx85;->o:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 9
    .line 10
    iget-object p0, p0, Lx85;->r:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Ly10;

    .line 13
    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {v4, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 18
    .line 19
    .line 20
    iget-object p0, p0, Ly10;->d:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p0, Lrf2;

    .line 23
    .line 24
    invoke-virtual {p0, v3, v2}, Lrf2;->n(ZZ)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_0
    invoke-virtual {v4, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 29
    .line 30
    .line 31
    iget-object p0, p0, Ly10;->d:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p0, Lxc5;

    .line 34
    .line 35
    invoke-static {p0, v3, v2}, Lxc5;->l(Lxc5;ZZ)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
