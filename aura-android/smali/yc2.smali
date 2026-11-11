.class public final Lyc2;
.super Lzc2;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lw92;


# instance fields
.field public final r:Lba2;

.field public final synthetic s:Lad2;


# direct methods
.method public constructor <init>(Lad2;Lba2;La83;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lyc2;->s:Lad2;

    .line 2
    .line 3
    invoke-direct {p0, p1, p3}, Lzc2;-><init>(Lad2;La83;)V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lyc2;->r:Lba2;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b(Lba2;Lq92;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lyc2;->r:Lba2;

    .line 2
    .line 3
    invoke-interface {p1}, Lba2;->h()Lea2;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    iget-object p2, p2, Lea2;->h:Lr92;

    .line 8
    .line 9
    sget-object v0, Lr92;->n:Lr92;

    .line 10
    .line 11
    if-ne p2, v0, :cond_0

    .line 12
    .line 13
    iget-object p1, p0, Lyc2;->s:Lad2;

    .line 14
    .line 15
    iget-object p0, p0, Lzc2;->n:La83;

    .line 16
    .line 17
    invoke-virtual {p1, p0}, Lad2;->j(La83;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    :goto_0
    if-eq v0, p2, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0}, Lyc2;->e()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    invoke-virtual {p0, v0}, Lzc2;->a(Z)V

    .line 29
    .line 30
    .line 31
    invoke-interface {p1}, Lba2;->h()Lea2;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iget-object v0, v0, Lea2;->h:Lr92;

    .line 36
    .line 37
    move-object v1, v0

    .line 38
    move-object v0, p2

    .line 39
    move-object p2, v1

    .line 40
    goto :goto_0

    .line 41
    :cond_1
    return-void
.end method

.method public final c()V
    .locals 1

    .line 1
    iget-object v0, p0, Lyc2;->r:Lba2;

    .line 2
    .line 3
    invoke-interface {v0}, Lba2;->h()Lea2;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p0}, Lea2;->f(Laa2;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public final d(Lba2;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lyc2;->r:Lba2;

    .line 2
    .line 3
    if-ne p0, p1, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public final e()Z
    .locals 1

    .line 1
    iget-object p0, p0, Lyc2;->r:Lba2;

    .line 2
    .line 3
    invoke-interface {p0}, Lba2;->h()Lea2;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget-object p0, p0, Lea2;->h:Lr92;

    .line 8
    .line 9
    sget-object v0, Lr92;->q:Lr92;

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-ltz p0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_0
    const/4 p0, 0x0

    .line 20
    return p0
.end method
