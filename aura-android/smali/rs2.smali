.class public final synthetic Lrs2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lgt2;
.implements Lht2;
.implements Lwc0;


# instance fields
.field public final synthetic n:Lkt2;

.field public final synthetic o:I

.field public final synthetic p:I


# direct methods
.method public synthetic constructor <init>(Lkt2;II)V
    .locals 0

    .line 1
    iput-object p1, p0, Lrs2;->n:Lkt2;

    .line 2
    .line 3
    iput p2, p0, Lrs2;->o:I

    .line 4
    .line 5
    iput p3, p0, Lrs2;->p:I

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
    check-cast p1, Lal3;

    .line 2
    .line 3
    iget-object p1, p0, Lrs2;->n:Lkt2;

    .line 4
    .line 5
    iget-object v0, p1, Lkt2;->e:Ljava/lang/ref/WeakReference;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ltn2;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-object p1, p1, Lkt2;->j:Ljt2;

    .line 17
    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    iget v0, p0, Lrs2;->o:I

    .line 21
    .line 22
    iget p0, p0, Lrs2;->p:I

    .line 23
    .line 24
    invoke-virtual {p1, v0, p0}, Ljt2;->setFixedSize(II)V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public b(Lal3;Lfr2;Ljava/util/List;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lrs2;->n:Lkt2;

    .line 2
    .line 3
    iget v1, p0, Lrs2;->o:I

    .line 4
    .line 5
    invoke-virtual {v0, p2, p1, v1}, Lkt2;->L0(Lfr2;Lal3;I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget p0, p0, Lrs2;->p:I

    .line 10
    .line 11
    invoke-virtual {v0, p2, p1, p0}, Lkt2;->L0(Lfr2;Lal3;I)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    invoke-virtual {p1, v1, p0, p3}, Lal3;->L(IILjava/util/List;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public e(Lal3;Lfr2;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lrs2;->n:Lkt2;

    .line 2
    .line 3
    iget v1, p0, Lrs2;->o:I

    .line 4
    .line 5
    invoke-virtual {v0, p2, p1, v1}, Lkt2;->L0(Lfr2;Lal3;I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget p0, p0, Lrs2;->p:I

    .line 10
    .line 11
    invoke-virtual {v0, p2, p1, p0}, Lkt2;->L0(Lfr2;Lal3;I)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    invoke-virtual {p1, v1, p0}, Lal3;->P(II)V

    .line 16
    .line 17
    .line 18
    return-void
.end method
