.class public final Ltf2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Loi3;


# instance fields
.field public final synthetic n:Lcom/eddyizm/tempus/ui/activity/MainActivity;


# direct methods
.method public constructor <init>(Lcom/eddyizm/tempus/ui/activity/MainActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ltf2;->n:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final V(Z)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p0, p0, Ltf2;->n:Lcom/eddyizm/tempus/ui/activity/MainActivity;

    .line 4
    .line 5
    iget-object p1, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->W:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 6
    .line 7
    iget p1, p1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Y:I

    .line 8
    .line 9
    const/4 v0, 0x5

    .line 10
    if-ne p1, v0, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, Lcom/eddyizm/tempus/ui/activity/MainActivity;->V:Lzg5;

    .line 13
    .line 14
    iget-object p0, p0, Lzg5;->n:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Lau;

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    invoke-virtual {p0, p1}, Lau;->d(Z)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method
