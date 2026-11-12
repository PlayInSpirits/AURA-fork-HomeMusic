.class public final Lfj5;
.super Lfh5;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public final synthetic g:Lcom/google/android/gms/common/internal/a;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/common/internal/a;I)V
    .locals 1

    .line 1
    iput-object p1, p0, Lfj5;->g:Lcom/google/android/gms/common/internal/a;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, p1, p2, v0}, Lfh5;-><init>(Lcom/google/android/gms/common/internal/a;ILandroid/os/Bundle;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final a(Lka0;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lfj5;->g:Lcom/google/android/gms/common/internal/a;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/google/android/gms/common/internal/a;->v:Lpp;

    .line 4
    .line 5
    invoke-interface {p0, p1}, Lpp;->k(Lka0;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final b()Z
    .locals 1

    .line 1
    iget-object p0, p0, Lfj5;->g:Lcom/google/android/gms/common/internal/a;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/google/android/gms/common/internal/a;->v:Lpp;

    .line 4
    .line 5
    sget-object v0, Lka0;->r:Lka0;

    .line 6
    .line 7
    invoke-interface {p0, v0}, Lpp;->k(Lka0;)V

    .line 8
    .line 9
    .line 10
    const/4 p0, 0x1

    .line 11
    return p0
.end method
