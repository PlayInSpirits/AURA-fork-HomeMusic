.class public abstract Ljs1;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# static fields
.field public static final a:Lk03;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lk03;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lad2;-><init>(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ljs1;->a:Lk03;

    .line 8
    .line 9
    return-void
.end method

.method public static final a(Lcom/eddyizm/tempus/ui/activity/MainActivity;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Ljs1;->a:Lk03;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Lad2;->k(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->R:Lqp4;

    .line 10
    .line 11
    if-eqz p1, :cond_2

    .line 12
    .line 13
    iget-object p1, p1, Lqp4;->a:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p1, Lcom/google/android/material/bottomnavigation/BottomNavigationView;

    .line 16
    .line 17
    iget-object v0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->T:Lv23;

    .line 18
    .line 19
    invoke-virtual {v0}, Lv23;->g()Lr23;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const v1, 0x7f0a02ed

    .line 24
    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    iget v0, v0, Lr23;->u:I

    .line 29
    .line 30
    if-ne v0, v1, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-virtual {p1, v1}, Ls33;->setSelectedItemId(I)V

    .line 34
    .line 35
    .line 36
    :goto_0
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Lzg5;

    .line 37
    .line 38
    if-eqz p1, :cond_2

    .line 39
    .line 40
    iget-object p1, p1, Lzg5;->n:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p1, Lau;

    .line 43
    .line 44
    iget-boolean v0, p1, Lau;->a:Z

    .line 45
    .line 46
    if-nez v0, :cond_1

    .line 47
    .line 48
    iget-object p1, p1, Lau;->b:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 51
    .line 52
    iget p1, p1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Y:I

    .line 53
    .line 54
    const/4 v0, 0x3

    .line 55
    if-eq p1, v0, :cond_1

    .line 56
    .line 57
    const/4 v0, 0x2

    .line 58
    if-ne p1, v0, :cond_2

    .line 59
    .line 60
    :cond_1
    invoke-virtual {p0}, Lcom/eddyizm/tempus/ui/activity/MainActivity;->q()V

    .line 61
    .line 62
    .line 63
    :cond_2
    return-void
.end method
