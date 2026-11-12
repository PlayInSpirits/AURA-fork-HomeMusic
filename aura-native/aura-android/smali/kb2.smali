.class public final Lkb2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public n:Lmb2;

.field public o:Lmb2;

.field public p:I

.field public final synthetic q:Lnb2;

.field public final synthetic r:I


# direct methods
.method public constructor <init>(Lnb2;I)V
    .locals 0

    .line 1
    iput p2, p0, Lkb2;->r:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lkb2;->q:Lnb2;

    .line 7
    .line 8
    iget-object p2, p1, Lnb2;->s:Lmb2;

    .line 9
    .line 10
    iget-object p2, p2, Lmb2;->q:Lmb2;

    .line 11
    .line 12
    iput-object p2, p0, Lkb2;->n:Lmb2;

    .line 13
    .line 14
    const/4 p2, 0x0

    .line 15
    iput-object p2, p0, Lkb2;->o:Lmb2;

    .line 16
    .line 17
    iget p1, p1, Lnb2;->r:I

    .line 18
    .line 19
    iput p1, p0, Lkb2;->p:I

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lkb2;->b()Lmb2;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final b()Lmb2;
    .locals 4

    .line 1
    iget-object v0, p0, Lkb2;->n:Lmb2;

    .line 2
    .line 3
    iget-object v1, p0, Lkb2;->q:Lnb2;

    .line 4
    .line 5
    iget-object v2, v1, Lnb2;->s:Lmb2;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-eq v0, v2, :cond_1

    .line 9
    .line 10
    iget v1, v1, Lnb2;->r:I

    .line 11
    .line 12
    iget v2, p0, Lkb2;->p:I

    .line 13
    .line 14
    if-ne v1, v2, :cond_0

    .line 15
    .line 16
    iget-object v1, v0, Lmb2;->q:Lmb2;

    .line 17
    .line 18
    iput-object v1, p0, Lkb2;->n:Lmb2;

    .line 19
    .line 20
    iput-object v0, p0, Lkb2;->o:Lmb2;

    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_0
    invoke-static {}, Lkf2;->c()V

    .line 24
    .line 25
    .line 26
    return-object v3

    .line 27
    :cond_1
    invoke-static {}, Ltb4;->k()V

    .line 28
    .line 29
    .line 30
    return-object v3
.end method

.method public final hasNext()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lkb2;->n:Lmb2;

    .line 2
    .line 3
    iget-object p0, p0, Lkb2;->q:Lnb2;

    .line 4
    .line 5
    iget-object p0, p0, Lnb2;->s:Lmb2;

    .line 6
    .line 7
    if-eq v0, p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public next()Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lkb2;->r:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lkb2;->a()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    invoke-virtual {p0}, Lkb2;->b()Lmb2;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    iget-object p0, p0, Lmb2;->s:Ljava/lang/Object;

    .line 16
    .line 17
    return-object p0

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public final remove()V
    .locals 3

    .line 1
    iget-object v0, p0, Lkb2;->o:Lmb2;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    iget-object v2, p0, Lkb2;->q:Lnb2;

    .line 7
    .line 8
    invoke-virtual {v2, v0, v1}, Lnb2;->c(Lmb2;Z)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, Lkb2;->o:Lmb2;

    .line 13
    .line 14
    iget v0, v2, Lnb2;->r:I

    .line 15
    .line 16
    iput v0, p0, Lkb2;->p:I

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    invoke-static {}, Ltb4;->a()V

    .line 20
    .line 21
    .line 22
    return-void
.end method
