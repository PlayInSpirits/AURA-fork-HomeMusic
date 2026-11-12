.class public final Ly92;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ls92;
.implements Laa2;


# instance fields
.field public final n:Ljava/util/HashSet;

.field public final o:Lea2;


# direct methods
.method public constructor <init>(Lea2;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashSet;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Ly92;->n:Ljava/util/HashSet;

    .line 10
    .line 11
    iput-object p1, p0, Ly92;->o:Lea2;

    .line 12
    .line 13
    invoke-virtual {p1, p0}, Lea2;->a(Laa2;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a(Lz92;)V
    .locals 0

    .line 1
    iget-object p0, p0, Ly92;->n:Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final f(Lz92;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ly92;->n:Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Ly92;->o:Lea2;

    .line 7
    .line 8
    iget-object p0, p0, Lea2;->h:Lr92;

    .line 9
    .line 10
    sget-object v0, Lr92;->n:Lr92;

    .line 11
    .line 12
    if-ne p0, v0, :cond_0

    .line 13
    .line 14
    invoke-interface {p1}, Lz92;->h()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    sget-object v0, Lr92;->q:Lr92;

    .line 19
    .line 20
    invoke-virtual {p0, v0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    if-ltz p0, :cond_1

    .line 25
    .line 26
    invoke-interface {p1}, Lz92;->n()V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    invoke-interface {p1}, Lz92;->j()V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public onDestroy(Lba2;)V
    .locals 4
    .annotation runtime Lf93;
        value = .enum Lq92;->ON_DESTROY:Lq92;
    .end annotation

    .line 1
    iget-object v0, p0, Ly92;->n:Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-static {v0}, Le35;->B(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    :goto_0
    if-ge v2, v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    add-int/lit8 v2, v2, 0x1

    .line 19
    .line 20
    check-cast v3, Lz92;

    .line 21
    .line 22
    invoke-interface {v3}, Lz92;->h()V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-interface {p1}, Lba2;->h()Lea2;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p1, p0}, Lea2;->f(Laa2;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public onStart(Lba2;)V
    .locals 2
    .annotation runtime Lf93;
        value = .enum Lq92;->ON_START:Lq92;
    .end annotation

    .line 1
    iget-object p0, p0, Ly92;->n:Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-static {p0}, Le35;->B(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    const/4 v0, 0x0

    .line 12
    :goto_0
    if-ge v0, p1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    add-int/lit8 v0, v0, 0x1

    .line 19
    .line 20
    check-cast v1, Lz92;

    .line 21
    .line 22
    invoke-interface {v1}, Lz92;->n()V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-void
.end method

.method public onStop(Lba2;)V
    .locals 2
    .annotation runtime Lf93;
        value = .enum Lq92;->ON_STOP:Lq92;
    .end annotation

    .line 1
    iget-object p0, p0, Ly92;->n:Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-static {p0}, Le35;->B(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    const/4 v0, 0x0

    .line 12
    :goto_0
    if-ge v0, p1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    add-int/lit8 v0, v0, 0x1

    .line 19
    .line 20
    check-cast v1, Lz92;

    .line 21
    .line 22
    invoke-interface {v1}, Lz92;->j()V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-void
.end method
