.class public final synthetic Ldefpackage/z33;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ldefpackage/e23;


# instance fields
.field public final synthetic a:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ldefpackage/z33;->a:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Ldefpackage/v23;Ldefpackage/r23;)V
    .locals 0

    .line 1
    iget p1, p2, Ldefpackage/r23;->u:I

    .line 2
    .line 3
    const p2, 0x7f0a02af

    .line 4
    .line 5
    .line 6
    if-eq p1, p2, :cond_1

    .line 7
    .line 8
    const p2, 0x7f0a0338

    .line 9
    .line 10
    .line 11
    if-eq p1, p2, :cond_1

    .line 12
    .line 13
    const p2, 0x7f0a01c1

    .line 14
    .line 15
    .line 16
    if-eq p1, p2, :cond_1

    .line 17
    .line 18
    const p2, 0x7f0a02ed

    .line 19
    .line 20
    .line 21
    if-eq p1, p2, :cond_1

    .line 22
    .line 23
    const p2, 0x7f0a009c

    .line 24
    .line 25
    .line 26
    if-eq p1, p2, :cond_1

    .line 27
    .line 28
    const p2, 0x7f0a00e0

    .line 29
    .line 30
    .line 31
    if-eq p1, p2, :cond_1

    .line 32
    .line 33
    const p2, 0x7f0a0267

    .line 34
    .line 35
    .line 36
    if-eq p1, p2, :cond_1

    .line 37
    .line 38
    const p2, 0x7f0a049e

    .line 39
    .line 40
    .line 41
    if-ne p1, p2, :cond_0

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    const/4 p1, 0x0

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 47
    :goto_1
    iget-object p0, p0, Ldefpackage/z33;->a:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 48
    .line 49
    iget p2, p0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Y:I

    .line 50
    .line 51
    if-eqz p1, :cond_2

    .line 52
    .line 53
    const/4 p1, 0x3

    .line 54
    if-ne p2, p1, :cond_2

    .line 55
    .line 56
    const/4 p1, 0x4

    .line 57
    invoke-virtual {p0, p1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->J(I)V

    .line 58
    .line 59
    .line 60
    :cond_2
    return-void
.end method
