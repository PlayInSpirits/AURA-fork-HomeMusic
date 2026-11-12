.class public final Lie5;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lke5;


# direct methods
.method public constructor <init>(Lke5;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lie5;->o:Lke5;

    .line 5
    .line 6
    iput p2, p0, Lie5;->n:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lie5;->o:Lke5;

    .line 2
    .line 3
    iget-object p1, p1, Lke5;->q:Lnh2;

    .line 4
    .line 5
    iget-object v0, p1, Lnh2;->p0:Lix2;

    .line 6
    .line 7
    iget v0, v0, Lix2;->o:I

    .line 8
    .line 9
    iget p0, p0, Lie5;->n:I

    .line 10
    .line 11
    invoke-static {p0, v0}, Lix2;->b(II)Lix2;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    iget-object v0, p1, Lnh2;->o0:Ldy;

    .line 16
    .line 17
    iget-object v1, v0, Ldy;->o:Lix2;

    .line 18
    .line 19
    iget-object v0, v0, Ldy;->n:Lix2;

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lix2;->a(Lix2;)I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-gez v2, :cond_0

    .line 26
    .line 27
    move-object p0, v0

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-virtual {p0, v1}, Lix2;->a(Lix2;)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-lez v0, :cond_1

    .line 34
    .line 35
    move-object p0, v1

    .line 36
    :cond_1
    :goto_0
    invoke-virtual {p1, p0}, Lnh2;->i0(Lix2;)V

    .line 37
    .line 38
    .line 39
    const/4 p0, 0x1

    .line 40
    invoke-virtual {p1, p0}, Lnh2;->j0(I)V

    .line 41
    .line 42
    .line 43
    return-void
.end method
