.class public final synthetic Lqn2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Ltn2;

.field public final synthetic p:Lmw1;

.field public final synthetic q:Lfr2;

.field public final synthetic r:I


# direct methods
.method public synthetic constructor <init>(Ltn2;Lmw1;Lfr2;II)V
    .locals 0

    .line 1
    iput p5, p0, Lqn2;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lqn2;->o:Ltn2;

    .line 4
    .line 5
    iput-object p2, p0, Lqn2;->p:Lmw1;

    .line 6
    .line 7
    iput-object p3, p0, Lqn2;->q:Lfr2;

    .line 8
    .line 9
    iput p4, p0, Lqn2;->r:I

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
    .locals 4

    .line 1
    iget v0, p0, Lqn2;->n:I

    .line 2
    .line 3
    iget v1, p0, Lqn2;->r:I

    .line 4
    .line 5
    iget-object v2, p0, Lqn2;->q:Lfr2;

    .line 6
    .line 7
    iget-object v3, p0, Lqn2;->p:Lmw1;

    .line 8
    .line 9
    iget-object p0, p0, Lqn2;->o:Ltn2;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    invoke-static {v3}, Ltn2;->E(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lm92;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-virtual {p0, v2, v0}, Ltn2;->n(Lfr2;Lm92;)V

    .line 26
    .line 27
    .line 28
    invoke-static {v1, v0}, Ltn2;->G(ILm92;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    return-void

    .line 32
    :pswitch_0
    invoke-static {v3}, Ltn2;->E(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Lm92;

    .line 37
    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    invoke-virtual {p0, v2, v0}, Ltn2;->n(Lfr2;Lm92;)V

    .line 41
    .line 42
    .line 43
    invoke-static {v1, v0}, Ltn2;->G(ILm92;)V

    .line 44
    .line 45
    .line 46
    :cond_1
    return-void

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
