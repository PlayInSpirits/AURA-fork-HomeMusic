.class public final synthetic Lrn2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/util/concurrent/Executor;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ltn2;


# direct methods
.method public synthetic constructor <init>(Ltn2;I)V
    .locals 0

    .line 1
    iput p2, p0, Lrn2;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lrn2;->o:Ltn2;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final execute(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget v0, p0, Lrn2;->n:I

    .line 2
    .line 3
    iget-object p0, p0, Lrn2;->o:Ltn2;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Ltn2;->l:Landroid/os/Handler;

    .line 9
    .line 10
    invoke-static {p0, p1}, Lf35;->W(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    iget-object p0, p0, Ltn2;->l:Landroid/os/Handler;

    .line 15
    .line 16
    invoke-static {p0, p1}, Lf35;->W(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_1
    invoke-static {p0, p1}, Ltn2;->b(Ltn2;Ljava/lang/Runnable;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
