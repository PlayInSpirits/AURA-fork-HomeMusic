.class public final synthetic Lkm;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lxc5;

.field public final synthetic p:Lbj0;


# direct methods
.method public synthetic constructor <init>(Lxc5;Lbj0;I)V
    .locals 0

    .line 1
    iput p3, p0, Lkm;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lkm;->o:Lxc5;

    .line 4
    .line 5
    iput-object p2, p0, Lkm;->p:Lbj0;

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
    .locals 2

    .line 1
    iget v0, p0, Lkm;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lkm;->o:Lxc5;

    .line 7
    .line 8
    iget-object p0, p0, Lkm;->p:Lbj0;

    .line 9
    .line 10
    iget-object v0, v0, Lxc5;->p:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Lqm;

    .line 13
    .line 14
    sget-object v1, Lf35;->a:Ljava/lang/String;

    .line 15
    .line 16
    invoke-interface {v0, p0}, Lqm;->T(Lbj0;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    iget-object v0, p0, Lkm;->o:Lxc5;

    .line 21
    .line 22
    iget-object p0, p0, Lkm;->p:Lbj0;

    .line 23
    .line 24
    monitor-enter p0

    .line 25
    monitor-exit p0

    .line 26
    iget-object v0, v0, Lxc5;->p:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Lqm;

    .line 29
    .line 30
    sget-object v1, Lf35;->a:Ljava/lang/String;

    .line 31
    .line 32
    invoke-interface {v0, p0}, Lqm;->o(Lbj0;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
