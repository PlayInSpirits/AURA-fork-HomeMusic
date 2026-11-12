.class public final synthetic Lo74;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lb85;
.implements Lr83;


# instance fields
.field public final synthetic n:Lcom/google/android/material/search/SearchView;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/material/search/SearchView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lo74;->n:Lcom/google/android/material/search/SearchView;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public m(Landroid/view/View;Lpb5;Lc85;)Lpb5;
    .locals 3

    .line 1
    iget-object p0, p0, Lo74;->n:Lcom/google/android/material/search/SearchView;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/google/android/material/search/SearchView;->t:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 4
    .line 5
    invoke-static {p0}, Lvr1;->z(Landroid/view/View;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    iget v0, p3, Lc85;->c:I

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget v0, p3, Lc85;->a:I

    .line 15
    .line 16
    :goto_0
    if-eqz p1, :cond_1

    .line 17
    .line 18
    iget p1, p3, Lc85;->a:I

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    iget p1, p3, Lc85;->c:I

    .line 22
    .line 23
    :goto_1
    invoke-virtual {p2}, Lpb5;->b()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    add-int/2addr v1, v0

    .line 28
    iget v0, p3, Lc85;->b:I

    .line 29
    .line 30
    invoke-virtual {p2}, Lpb5;->c()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    add-int/2addr v2, p1

    .line 35
    iget p1, p3, Lc85;->d:I

    .line 36
    .line 37
    invoke-virtual {p0, v1, v0, v2, p1}, Landroid/view/View;->setPadding(IIII)V

    .line 38
    .line 39
    .line 40
    return-object p2
.end method

.method public x(Landroid/view/View;Lpb5;)Lpb5;
    .locals 0

    .line 1
    iget-object p0, p0, Lo74;->n:Lcom/google/android/material/search/SearchView;

    .line 2
    .line 3
    invoke-static {p0, p2}, Lcom/google/android/material/search/SearchView;->e(Lcom/google/android/material/search/SearchView;Lpb5;)V

    .line 4
    .line 5
    .line 6
    return-object p2
.end method
