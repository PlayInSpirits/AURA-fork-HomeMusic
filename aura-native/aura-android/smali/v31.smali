.class public final synthetic Lv31;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lqc2;
.implements Llm2;
.implements Lyr2;
.implements Lwc0;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:I

.field public final synthetic p:I


# direct methods
.method public synthetic constructor <init>(III)V
    .locals 0

    .line 1
    iput p3, p0, Lv31;->n:I

    .line 2
    .line 3
    iput p1, p0, Lv31;->o:I

    .line 4
    .line 5
    iput p2, p0, Lv31;->p:I

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public accept(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, Lv31;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lv31;->p:I

    .line 7
    .line 8
    check-cast p1, Lal3;

    .line 9
    .line 10
    iget p0, p0, Lv31;->o:I

    .line 11
    .line 12
    invoke-virtual {p1, p0, v0}, Lal3;->t0(II)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    iget v0, p0, Lv31;->p:I

    .line 17
    .line 18
    check-cast p1, Lal3;

    .line 19
    .line 20
    iget p0, p0, Lv31;->o:I

    .line 21
    .line 22
    invoke-virtual {p1, p0, v0}, Lal3;->H(II)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method

.method public c(Lbm2;)V
    .locals 1

    .line 1
    iget v0, p0, Lv31;->o:I

    .line 2
    .line 3
    iget p0, p0, Lv31;->p:I

    .line 4
    .line 5
    invoke-virtual {p1, v0, p0}, Lbm2;->p1(II)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public f(Ler2;I)V
    .locals 1

    .line 1
    iget v0, p0, Lv31;->o:I

    .line 2
    .line 3
    iget p0, p0, Lv31;->p:I

    .line 4
    .line 5
    invoke-interface {p1, p2, v0, p0}, Ler2;->i(III)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget v0, p0, Lv31;->n:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lv31;->p:I

    .line 7
    .line 8
    check-cast p1, Loi3;

    .line 9
    .line 10
    iget p0, p0, Lv31;->o:I

    .line 11
    .line 12
    invoke-interface {p1, p0, v0}, Loi3;->T(II)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    iget v0, p0, Lv31;->p:I

    .line 17
    .line 18
    check-cast p1, Loi3;

    .line 19
    .line 20
    iget p0, p0, Lv31;->o:I

    .line 21
    .line 22
    invoke-interface {p1, p0, v0}, Loi3;->T(II)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
