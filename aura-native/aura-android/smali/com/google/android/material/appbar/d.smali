.class public final Lcom/google/android/material/appbar/d;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lf4;


# instance fields
.field public final synthetic n:Lcom/google/android/material/appbar/AppBarLayout;

.field public final synthetic o:Z


# direct methods
.method public constructor <init>(Lcom/google/android/material/appbar/AppBarLayout;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/material/appbar/d;->n:Lcom/google/android/material/appbar/AppBarLayout;

    .line 5
    .line 6
    iput-boolean p2, p0, Lcom/google/android/material/appbar/d;->o:Z

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final h(Landroid/view/View;)Z
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/google/android/material/appbar/d;->n:Lcom/google/android/material/appbar/AppBarLayout;

    .line 2
    .line 3
    iget-boolean p0, p0, Lcom/google/android/material/appbar/d;->o:Z

    .line 4
    .line 5
    invoke-virtual {p1, p0}, Lcom/google/android/material/appbar/AppBarLayout;->setExpanded(Z)V

    .line 6
    .line 7
    .line 8
    const/4 p0, 0x1

    .line 9
    return p0
.end method
