.class public Lmz3;
.super Landroid/app/Fragment;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmz3$a;
    }
.end annotation


# static fields
.field public static final synthetic o:I


# instance fields
.field public n:Lsi1;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/app/Fragment;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a(Lq92;)V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-static {p0, p1}, Lkz3;->a(Landroid/app/Activity;Lq92;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final onActivityCreated(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/app/Fragment;->onActivityCreated(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    sget-object p1, Lq92;->ON_CREATE:Lq92;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lmz3;->a(Lq92;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final onDestroy()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/app/Fragment;->onDestroy()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lq92;->ON_DESTROY:Lq92;

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lmz3;->a(Lq92;)V

    .line 7
    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput-object v0, p0, Lmz3;->n:Lsi1;

    .line 11
    .line 12
    return-void
.end method

.method public final onPause()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/app/Fragment;->onPause()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lq92;->ON_PAUSE:Lq92;

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lmz3;->a(Lq92;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final onResume()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/app/Fragment;->onResume()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lmz3;->n:Lsi1;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, v0, Lsi1;->o:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Llq3;

    .line 11
    .line 12
    invoke-virtual {v0}, Llq3;->a()V

    .line 13
    .line 14
    .line 15
    :cond_0
    sget-object v0, Lq92;->ON_RESUME:Lq92;

    .line 16
    .line 17
    invoke-virtual {p0, v0}, Lmz3;->a(Lq92;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final onStart()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/app/Fragment;->onStart()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lmz3;->n:Lsi1;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, v0, Lsi1;->o:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Llq3;

    .line 11
    .line 12
    iget v1, v0, Llq3;->n:I

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    add-int/2addr v1, v2

    .line 16
    iput v1, v0, Llq3;->n:I

    .line 17
    .line 18
    if-ne v1, v2, :cond_0

    .line 19
    .line 20
    iget-boolean v1, v0, Llq3;->q:Z

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    iget-object v1, v0, Llq3;->s:Lea2;

    .line 25
    .line 26
    sget-object v2, Lq92;->ON_START:Lq92;

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Lea2;->d(Lq92;)V

    .line 29
    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    iput-boolean v1, v0, Llq3;->q:Z

    .line 33
    .line 34
    :cond_0
    sget-object v0, Lq92;->ON_START:Lq92;

    .line 35
    .line 36
    invoke-virtual {p0, v0}, Lmz3;->a(Lq92;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public final onStop()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/app/Fragment;->onStop()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lq92;->ON_STOP:Lq92;

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lmz3;->a(Lq92;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
