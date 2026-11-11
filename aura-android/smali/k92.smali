.class public final synthetic Lk92;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic n:I

.field public final synthetic o:Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;I)V
    .locals 0

    .line 1
    iput p2, p0, Lk92;->n:I

    .line 2
    .line 3
    iput-object p1, p0, Lk92;->o:Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 4

    .line 1
    iget p1, p0, Lk92;->n:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    iget-object p0, p0, Lk92;->o:Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;

    .line 5
    .line 6
    packed-switch p1, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->o0:Ln92;

    .line 10
    .line 11
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    iget-object v1, p1, Ln92;->f:Ly41;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    const/16 v1, 0xf

    .line 21
    .line 22
    invoke-static {v1, v0}, Ly41;->j(IZ)Lk03;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    iget-object p1, p1, Ln92;->l:Lk03;

    .line 27
    .line 28
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    new-instance v2, Lg7;

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    invoke-direct {v2, p1, v3}, Lg7;-><init>(Lk03;I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, p0, v2}, Lad2;->e(Lba2;La83;)V

    .line 38
    .line 39
    .line 40
    return v0

    .line 41
    :pswitch_0
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->o0:Ln92;

    .line 42
    .line 43
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {p1, p0}, Ln92;->e(Lle1;)V

    .line 48
    .line 49
    .line 50
    return v0

    .line 51
    :pswitch_1
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->o0:Ln92;

    .line 52
    .line 53
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-virtual {p1, p0}, Ln92;->d(Lle1;)V

    .line 58
    .line 59
    .line 60
    return v0

    .line 61
    :pswitch_2
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/fragment/LibraryFragment;->o0:Ln92;

    .line 62
    .line 63
    invoke-virtual {p0}, Lkc1;->v()Lle1;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-virtual {p1, p0}, Ln92;->f(Lle1;)V

    .line 68
    .line 69
    .line 70
    return v0

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
