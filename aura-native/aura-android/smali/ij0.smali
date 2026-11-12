.class public final synthetic Lij0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lqc2;
.implements Leg1;
.implements Llm2;
.implements Lwc0;
.implements Lit2;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:I


# direct methods
.method public synthetic constructor <init>(II)V
    .locals 0

    .line 13
    iput p2, p0, Lij0;->n:I

    iput p1, p0, Lij0;->o:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ILva4;Landroid/os/Bundle;Landroid/os/Bundle;)V
    .locals 0

    .line 11
    const/4 p2, 0x5

    iput p2, p0, Lij0;->n:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lij0;->o:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;IILjn2;)V
    .locals 0

    .line 1
    const/16 p1, 0x9

    .line 2
    .line 3
    iput p1, p0, Lij0;->n:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput p3, p0, Lij0;->o:I

    .line 9
    .line 10
    return-void
.end method

.method public synthetic constructor <init>(Lq9;ILpi3;Lpi3;)V
    .locals 0

    .line 12
    const/4 p1, 0x0

    iput p1, p0, Lij0;->n:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lij0;->o:I

    return-void
.end method


# virtual methods
.method public accept(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, Lij0;->n:I

    .line 2
    .line 3
    iget p0, p0, Lij0;->o:I

    .line 4
    .line 5
    check-cast p1, Lal3;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, p0}, Lal3;->G0(I)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    invoke-virtual {p1, p0}, Lal3;->p0(I)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_1
    invoke-virtual {p1, p0}, Lal3;->J(I)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_2
    invoke-virtual {p1, p0}, Lal3;->d0(I)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Integer;

    .line 2
    .line 3
    iget p0, p0, Lij0;->o:I

    .line 4
    .line 5
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public c(Lbm2;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lbm2;->Y()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget-object p1, p1, Lbm2;->l:Landroid/util/SparseArray;

    .line 9
    .line 10
    iget p0, p0, Lij0;->o:I

    .line 11
    .line 12
    invoke-virtual {p1, p0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    if-nez p0, :cond_1

    .line 17
    .line 18
    :goto_0
    return-void

    .line 19
    :cond_1
    invoke-static {}, Lkf2;->k()V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public h(Ltn2;Lfr2;I)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object p3, p1, Ltn2;->D:Lpq;

    .line 2
    .line 3
    invoke-virtual {p1, p2}, Ltn2;->B(Lfr2;)Lfr2;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/4 p3, -0x6

    .line 10
    invoke-static {p3}, Lm92;->b(I)Lm92;

    .line 11
    .line 12
    .line 13
    move-result-object p3

    .line 14
    new-instance v2, Lmw1;

    .line 15
    .line 16
    invoke-direct {v2, p3}, Lmw1;-><init>(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    new-instance v0, Lqn2;

    .line 20
    .line 21
    const/4 v5, 0x1

    .line 22
    iget v4, p0, Lij0;->o:I

    .line 23
    .line 24
    move-object v1, p1

    .line 25
    move-object v3, p2

    .line 26
    invoke-direct/range {v0 .. v5}, Lqn2;-><init>(Ltn2;Lmw1;Lfr2;II)V

    .line 27
    .line 28
    .line 29
    new-instance p0, Lrn2;

    .line 30
    .line 31
    const/4 p1, 0x0

    .line 32
    invoke-direct {p0, v1, p1}, Lrn2;-><init>(Ltn2;I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2, v0, p0}, Lmw1;->f(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 36
    .line 37
    .line 38
    return-object v2
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, Lij0;->n:I

    .line 2
    .line 3
    iget p0, p0, Lij0;->o:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Loi3;

    .line 9
    .line 10
    invoke-interface {p1, p0}, Loi3;->f(I)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    check-cast p1, Loi3;

    .line 15
    .line 16
    invoke-interface {p1, p0}, Loi3;->b(I)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_1
    check-cast p1, Loi3;

    .line 21
    .line 22
    invoke-interface {p1, p0}, Loi3;->f(I)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_2
    check-cast p1, Lho2;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    const/4 v0, 0x1

    .line 32
    if-ne p0, v0, :cond_0

    .line 33
    .line 34
    iput-boolean v0, p1, Lho2;->v:Z

    .line 35
    .line 36
    :cond_0
    iput p0, p1, Lho2;->l:I

    .line 37
    .line 38
    return-void

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
