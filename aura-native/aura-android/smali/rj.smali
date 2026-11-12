.class public final Lrj;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lzz3;


# instance fields
.field public final synthetic n:Ljava/lang/String;

.field public final synthetic o:Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;


# direct methods
.method public constructor <init>(Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lrj;->o:Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;

    .line 5
    .line 6
    iput-object p2, p0, Lrj;->n:Ljava/lang/String;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lcom/bumptech/glide/load/engine/GlideException;)Z
    .locals 4

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/bumptech/glide/load/engine/GlideException;->getMessage()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/bumptech/glide/load/engine/GlideException;->getMessage()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const-string v0, "400"

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    iget-object p1, p0, Lrj;->n:Ljava/lang/String;

    .line 19
    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    const-string v0, "Primary ID failed (400), trying fallback: "

    .line 23
    .line 24
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const-string v1, "ArtistCover"

    .line 29
    .line 30
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    iget-object p0, p0, Lrj;->o:Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;

    .line 34
    .line 35
    invoke-virtual {p0}, Lkc1;->Z()Landroid/content/Context;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-static {v0}, Lcom/bumptech/glide/a;->c(Landroid/content/Context;)Lc04;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-static {}, Lud3;->t()I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    invoke-static {v2, p1}, Lwg0;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    const/4 v3, 0x3

    .line 52
    invoke-static {v0, p1, v3, v1, v2}, Lb11;->g(Landroid/content/Context;Ljava/lang/String;ILc04;Ljava/lang/String;)Lvz3;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-static {}, Lxv0;->b()Lxv0;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {p1, v0}, Lvz3;->T(Lxv0;)Lvz3;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-static {}, Lud3;->R()Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-eqz v0, :cond_0

    .line 69
    .line 70
    invoke-virtual {p1}, Llq;->l()Llq;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    check-cast p1, Lvz3;

    .line 75
    .line 76
    :cond_0
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/fragment/ArtistPageFragment;->l0:Lsc1;

    .line 77
    .line 78
    iget-object p0, p0, Lsc1;->f:Landroid/widget/ImageView;

    .line 79
    .line 80
    invoke-virtual {p1, p0}, Lvz3;->K(Landroid/widget/ImageView;)V

    .line 81
    .line 82
    .line 83
    const/4 p0, 0x1

    .line 84
    return p0

    .line 85
    :cond_1
    const/4 p0, 0x0

    .line 86
    return p0
.end method

.method public final bridge synthetic g(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    return-void
.end method
