.class public final Lda2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public a:Lr92;

.field public b:Lw92;


# virtual methods
.method public final a(Lba2;Lq92;)V
    .locals 3

    .line 1
    invoke-virtual {p2}, Lq92;->a()Lr92;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lda2;->a:Lr92;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-gez v2, :cond_0

    .line 12
    .line 13
    move-object v1, v0

    .line 14
    :cond_0
    iput-object v1, p0, Lda2;->a:Lr92;

    .line 15
    .line 16
    iget-object v1, p0, Lda2;->b:Lw92;

    .line 17
    .line 18
    invoke-interface {v1, p1, p2}, Lw92;->b(Lba2;Lq92;)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Lda2;->a:Lr92;

    .line 22
    .line 23
    return-void
.end method
