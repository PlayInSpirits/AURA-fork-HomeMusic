.class public final synthetic Lul3;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:Lcom/eddyizm/tempus/ui/fragment/PlaylistEditorFragment;

.field public final synthetic o:[Z

.field public final synthetic p:I

.field public final synthetic q:Lcom/eddyizm/tempus/subsonic/models/Child;


# direct methods
.method public synthetic constructor <init>(Lcom/eddyizm/tempus/ui/fragment/PlaylistEditorFragment;[ZILcom/eddyizm/tempus/subsonic/models/Child;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lul3;->n:Lcom/eddyizm/tempus/ui/fragment/PlaylistEditorFragment;

    .line 5
    .line 6
    iput-object p2, p0, Lul3;->o:[Z

    .line 7
    .line 8
    iput p3, p0, Lul3;->p:I

    .line 9
    .line 10
    iput-object p4, p0, Lul3;->q:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .line 1
    iget-object p1, p0, Lul3;->n:Lcom/eddyizm/tempus/ui/fragment/PlaylistEditorFragment;

    .line 2
    .line 3
    iget-object v0, p1, Lcom/eddyizm/tempus/ui/fragment/PlaylistEditorFragment;->n0:Lzd0;

    .line 4
    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    iget-object v0, p0, Lul3;->o:[Z

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    aget-boolean v2, v0, v1

    .line 11
    .line 12
    if-nez v2, :cond_3

    .line 13
    .line 14
    iget-object v2, p1, Lcom/eddyizm/tempus/ui/fragment/PlaylistEditorFragment;->m0:Lwl3;

    .line 15
    .line 16
    iget-boolean v3, v2, Lwl3;->i:Z

    .line 17
    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    goto :goto_2

    .line 21
    :cond_0
    const/4 v3, 0x1

    .line 22
    aput-boolean v3, v0, v1

    .line 23
    .line 24
    iget-object v0, v2, Lwl3;->g:Lk03;

    .line 25
    .line 26
    invoke-virtual {v0}, Lad2;->d()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Ljava/util/List;

    .line 31
    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    iget-object v2, p0, Lul3;->q:Lcom/eddyizm/tempus/subsonic/models/Child;

    .line 35
    .line 36
    if-nez v2, :cond_1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    iget p0, p0, Lul3;->p:I

    .line 40
    .line 41
    invoke-static {p0, v1}, Ljava/lang/Math;->max(II)I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    invoke-static {p0, v1}, Ljava/lang/Math;->min(II)I

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    invoke-interface {v0, p0, v2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_2
    :goto_0
    const/4 p0, -0x1

    .line 58
    :goto_1
    if-ltz p0, :cond_3

    .line 59
    .line 60
    iget-object p1, p1, Lcom/eddyizm/tempus/ui/fragment/PlaylistEditorFragment;->n0:Lzd0;

    .line 61
    .line 62
    iget-object p1, p1, Ldw3;->n:Lew3;

    .line 63
    .line 64
    invoke-virtual {p1, p0, v3}, Lew3;->e(II)V

    .line 65
    .line 66
    .line 67
    :cond_3
    :goto_2
    return-void
.end method
