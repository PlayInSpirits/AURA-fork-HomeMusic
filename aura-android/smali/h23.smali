.class public final Lh23;
.super Lq42;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lif1;


# instance fields
.field public final synthetic n:Lfx3;

.field public final synthetic o:Ljava/util/ArrayList;

.field public final synthetic p:Lhx3;

.field public final synthetic q:Lv23;

.field public final synthetic r:Landroid/os/Bundle;


# direct methods
.method public constructor <init>(Lfx3;Ljava/util/ArrayList;Lhx3;Lv23;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lh23;->n:Lfx3;

    .line 2
    .line 3
    iput-object p2, p0, Lh23;->o:Ljava/util/ArrayList;

    .line 4
    .line 5
    iput-object p3, p0, Lh23;->p:Lhx3;

    .line 6
    .line 7
    iput-object p4, p0, Lh23;->q:Lv23;

    .line 8
    .line 9
    iput-object p5, p0, Lh23;->r:Landroid/os/Bundle;

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    invoke-direct {p0, p1}, Lq42;-><init>(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    check-cast p1, La23;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lh23;->n:Lfx3;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    iput-boolean v1, v0, Lfx3;->n:Z

    .line 10
    .line 11
    iget-object v0, p0, Lh23;->o:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    const/4 v3, -0x1

    .line 18
    if-eq v2, v3, :cond_0

    .line 19
    .line 20
    iget-object v3, p0, Lh23;->p:Lhx3;

    .line 21
    .line 22
    iget v4, v3, Lhx3;->n:I

    .line 23
    .line 24
    add-int/2addr v2, v1

    .line 25
    invoke-virtual {v0, v4, v2}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iput v2, v3, Lhx3;->n:I

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    sget-object v0, Lu01;->n:Lu01;

    .line 33
    .line 34
    :goto_0
    iget-object v1, p1, La23;->o:Lr23;

    .line 35
    .line 36
    iget-object v2, p0, Lh23;->r:Landroid/os/Bundle;

    .line 37
    .line 38
    iget-object p0, p0, Lh23;->q:Lv23;

    .line 39
    .line 40
    invoke-virtual {p0, v1, v2, p1, v0}, Lv23;->a(Lr23;Landroid/os/Bundle;La23;Ljava/util/List;)V

    .line 41
    .line 42
    .line 43
    sget-object p0, Lj15;->a:Lj15;

    .line 44
    .line 45
    return-object p0
.end method
