.class public final synthetic Lfs2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lks2;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lls2;

.field public final synthetic p:I


# direct methods
.method public synthetic constructor <init>(Lls2;II)V
    .locals 0

    .line 1
    iput p3, p0, Lfs2;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lfs2;->o:Lls2;

    .line 4
    .line 5
    iput p2, p0, Lfs2;->p:I

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final b(Lfr2;)V
    .locals 1

    .line 1
    iget p1, p0, Lfs2;->n:I

    .line 2
    .line 3
    iget v0, p0, Lfs2;->p:I

    .line 4
    .line 5
    iget-object p0, p0, Lfs2;->o:Lls2;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lls2;->g:Ltn2;

    .line 11
    .line 12
    iget-object p0, p0, Ltn2;->s:Lal3;

    .line 13
    .line 14
    invoke-static {v0}, Lf92;->u(I)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    invoke-virtual {p0, p1}, Lal3;->s(Z)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_0
    iget-object p0, p0, Lls2;->g:Ltn2;

    .line 23
    .line 24
    iget-object p0, p0, Ltn2;->s:Lal3;

    .line 25
    .line 26
    invoke-static {v0}, Lf92;->s(I)I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    invoke-virtual {p0, p1}, Lal3;->p0(I)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
