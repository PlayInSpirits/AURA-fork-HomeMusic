.class public final synthetic Ln55;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lrf2;

.field public final synthetic p:Lbj0;


# direct methods
.method public synthetic constructor <init>(Lrf2;Lbj0;I)V
    .locals 0

    .line 1
    iput p3, p0, Ln55;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Ln55;->o:Lrf2;

    .line 4
    .line 5
    iput-object p2, p0, Ln55;->p:Lbj0;

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
    iget v0, p0, Ln55;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ln55;->o:Lrf2;

    .line 7
    .line 8
    iget-object p0, p0, Ln55;->p:Lbj0;

    .line 9
    .line 10
    monitor-enter p0

    .line 11
    monitor-exit p0

    .line 12
    iget-object v0, v0, Lrf2;->o:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lo55;

    .line 15
    .line 16
    sget-object v1, Lf35;->a:Ljava/lang/String;

    .line 17
    .line 18
    invoke-interface {v0, p0}, Lo55;->k(Lbj0;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_0
    iget-object v0, p0, Ln55;->o:Lrf2;

    .line 23
    .line 24
    iget-object p0, p0, Ln55;->p:Lbj0;

    .line 25
    .line 26
    iget-object v0, v0, Lrf2;->o:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Lo55;

    .line 29
    .line 30
    sget-object v1, Lf35;->a:Ljava/lang/String;

    .line 31
    .line 32
    invoke-interface {v0, p0}, Lo55;->l(Lbj0;)V

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
