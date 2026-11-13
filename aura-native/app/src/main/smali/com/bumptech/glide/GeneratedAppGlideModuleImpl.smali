.class final Lcom/bumptech/glide/GeneratedAppGlideModuleImpl;
.super Lcom/bumptech/glide/GeneratedAppGlideModule;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final i:Lcom/eddyizm/tempus/glide/CustomGlideModule;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/bumptech/glide/GeneratedAppGlideModule;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance p1, Lcom/eddyizm/tempus/glide/CustomGlideModule;

    .line 5
    .line 6
    invoke-direct {p1}, Lcom/eddyizm/tempus/glide/CustomGlideModule;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/bumptech/glide/GeneratedAppGlideModuleImpl;->i:Lcom/eddyizm/tempus/glide/CustomGlideModule;

    .line 10
    .line 11
    const/4 p0, 0x3

    .line 12
    const-string p1, "Glide"

    .line 13
    .line 14
    invoke-static {p1, p0}, Landroid/util/Ldefpackage/og;->isLoggable(Ljava/lang/String;I)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    const-string p0, "Discovered AppGlideModule from annotation: com.eddyizm.tempus.glide.CustomGlideModule"

    .line 21
    .line 22
    invoke-static {p1, p0}, Landroid/util/Ldefpackage/og;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method


# virtual methods
.method public final G()V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bumptech/glide/GeneratedAppGlideModuleImpl;->i:Lcom/eddyizm/tempus/glide/CustomGlideModule;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final M(Landroid/content/Context;Lcom/bumptech/glide/a;Ldefpackage/ey3;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bumptech/glide/GeneratedAppGlideModuleImpl;->i:Lcom/eddyizm/tempus/glide/CustomGlideModule;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Lcom/eddyizm/tempus/glide/CustomGlideModule;->M(Landroid/content/Context;Lcom/bumptech/glide/a;Ldefpackage/ey3;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final V()Ljava/util/Set;
    .locals 0

    .line 1
    sget-object p0, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 2
    .line 3
    return-object p0
.end method

.method public final W()Ldefpackage/d04;
    .locals 1

    .line 1
    new-instance p0, Ldefpackage/y41;

    .line 2
    .line 3
    const/16 v0, 0x11

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ldefpackage/y41;-><init>(I)V

    .line 6
    .line 7
    .line 8
    return-object p0
.end method

.method public final e(Landroid/content/Context;Ldefpackage/hi1;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/bumptech/glide/GeneratedAppGlideModuleImpl;->i:Lcom/eddyizm/tempus/glide/CustomGlideModule;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/eddyizm/tempus/glide/CustomGlideModule;->e(Landroid/content/Context;Ldefpackage/hi1;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
