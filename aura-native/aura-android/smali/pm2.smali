.class public final Lpm2;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lpm2;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final n:Ljava/lang/String;

.field public final o:Ljava/lang/CharSequence;

.field public final p:Ljava/lang/CharSequence;

.field public final q:Ljava/lang/CharSequence;

.field public final r:Landroid/graphics/Bitmap;

.field public s:[B

.field public final t:Landroid/net/Uri;

.field public final u:Landroid/os/Bundle;

.field public final v:Landroid/net/Uri;

.field public w:Landroid/media/MediaDescription;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lhz0;

    .line 2
    .line 3
    const/16 v1, 0x13

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lhz0;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lpm2;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/graphics/Bitmap;Landroid/net/Uri;Landroid/os/Bundle;Landroid/net/Uri;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lpm2;->n:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lpm2;->o:Ljava/lang/CharSequence;

    .line 7
    .line 8
    iput-object p3, p0, Lpm2;->p:Ljava/lang/CharSequence;

    .line 9
    .line 10
    iput-object p4, p0, Lpm2;->q:Ljava/lang/CharSequence;

    .line 11
    .line 12
    iput-object p5, p0, Lpm2;->r:Landroid/graphics/Bitmap;

    .line 13
    .line 14
    iput-object p6, p0, Lpm2;->t:Landroid/net/Uri;

    .line 15
    .line 16
    iput-object p7, p0, Lpm2;->u:Landroid/os/Bundle;

    .line 17
    .line 18
    iput-object p8, p0, Lpm2;->v:Landroid/net/Uri;

    .line 19
    .line 20
    return-void
.end method

.method public static a(Landroid/media/MediaDescription;)Lpm2;
    .locals 13

    .line 1
    invoke-virtual {p0}, Landroid/media/MediaDescription;->getMediaId()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    invoke-virtual {p0}, Landroid/media/MediaDescription;->getTitle()Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-virtual {p0}, Landroid/media/MediaDescription;->getSubtitle()Ljava/lang/CharSequence;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    invoke-virtual {p0}, Landroid/media/MediaDescription;->getDescription()Ljava/lang/CharSequence;

    .line 14
    .line 15
    .line 16
    move-result-object v4

    .line 17
    invoke-virtual {p0}, Landroid/media/MediaDescription;->getIconBitmap()Landroid/graphics/Bitmap;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    invoke-virtual {p0}, Landroid/media/MediaDescription;->getIconUri()Landroid/net/Uri;

    .line 22
    .line 23
    .line 24
    move-result-object v6

    .line 25
    invoke-virtual {p0}, Landroid/media/MediaDescription;->getExtras()Landroid/os/Bundle;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v0}, Lf35;->n(Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    new-instance v7, Landroid/os/Bundle;

    .line 36
    .line 37
    invoke-direct {v7, v0}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 38
    .line 39
    .line 40
    move-object v0, v7

    .line 41
    :cond_0
    const/4 v7, 0x0

    .line 42
    if-eqz v0, :cond_3

    .line 43
    .line 44
    const-string v8, "android.support.v4.media.description.MEDIA_URI"

    .line 45
    .line 46
    invoke-virtual {v0, v8}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 47
    .line 48
    .line 49
    move-result-object v9

    .line 50
    check-cast v9, Landroid/net/Uri;

    .line 51
    .line 52
    if-eqz v9, :cond_2

    .line 53
    .line 54
    const-string v10, "android.support.v4.media.description.NULL_BUNDLE_FLAG"

    .line 55
    .line 56
    invoke-virtual {v0, v10}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 57
    .line 58
    .line 59
    move-result v11

    .line 60
    if-eqz v11, :cond_1

    .line 61
    .line 62
    invoke-virtual {v0}, Landroid/os/BaseBundle;->size()I

    .line 63
    .line 64
    .line 65
    move-result v11

    .line 66
    const/4 v12, 0x2

    .line 67
    if-ne v11, v12, :cond_1

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_1
    invoke-virtual {v0, v8}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, v10}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    :cond_2
    :goto_0
    move-object v7, v0

    .line 77
    goto :goto_1

    .line 78
    :cond_3
    move-object v9, v7

    .line 79
    goto :goto_0

    .line 80
    :goto_1
    if-eqz v9, :cond_4

    .line 81
    .line 82
    :goto_2
    move-object v8, v9

    .line 83
    goto :goto_3

    .line 84
    :cond_4
    invoke-virtual {p0}, Landroid/media/MediaDescription;->getMediaUri()Landroid/net/Uri;

    .line 85
    .line 86
    .line 87
    move-result-object v9

    .line 88
    goto :goto_2

    .line 89
    :goto_3
    new-instance v0, Lpm2;

    .line 90
    .line 91
    invoke-direct/range {v0 .. v8}, Lpm2;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/graphics/Bitmap;Landroid/net/Uri;Landroid/os/Bundle;Landroid/net/Uri;)V

    .line 92
    .line 93
    .line 94
    iput-object p0, v0, Lpm2;->w:Landroid/media/MediaDescription;

    .line 95
    .line 96
    return-object v0
.end method


# virtual methods
.method public final b()Landroid/media/MediaDescription;
    .locals 2

    .line 1
    iget-object v0, p0, Lpm2;->w:Landroid/media/MediaDescription;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    new-instance v0, Landroid/media/MediaDescription$Builder;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/media/MediaDescription$Builder;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lpm2;->n:Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/media/MediaDescription$Builder;->setMediaId(Ljava/lang/String;)Landroid/media/MediaDescription$Builder;

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Lpm2;->o:Ljava/lang/CharSequence;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/media/MediaDescription$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/media/MediaDescription$Builder;

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lpm2;->p:Ljava/lang/CharSequence;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroid/media/MediaDescription$Builder;->setSubtitle(Ljava/lang/CharSequence;)Landroid/media/MediaDescription$Builder;

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lpm2;->q:Ljava/lang/CharSequence;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Landroid/media/MediaDescription$Builder;->setDescription(Ljava/lang/CharSequence;)Landroid/media/MediaDescription$Builder;

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, Lpm2;->r:Landroid/graphics/Bitmap;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Landroid/media/MediaDescription$Builder;->setIconBitmap(Landroid/graphics/Bitmap;)Landroid/media/MediaDescription$Builder;

    .line 34
    .line 35
    .line 36
    iget-object v1, p0, Lpm2;->t:Landroid/net/Uri;

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Landroid/media/MediaDescription$Builder;->setIconUri(Landroid/net/Uri;)Landroid/media/MediaDescription$Builder;

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, Lpm2;->u:Landroid/os/Bundle;

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Landroid/media/MediaDescription$Builder;->setExtras(Landroid/os/Bundle;)Landroid/media/MediaDescription$Builder;

    .line 44
    .line 45
    .line 46
    iget-object v1, p0, Lpm2;->v:Landroid/net/Uri;

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Landroid/media/MediaDescription$Builder;->setMediaUri(Landroid/net/Uri;)Landroid/media/MediaDescription$Builder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Landroid/media/MediaDescription$Builder;->build()Landroid/media/MediaDescription;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iput-object v0, p0, Lpm2;->w:Landroid/media/MediaDescription;

    .line 56
    .line 57
    return-object v0
.end method

.method public final describeContents()I
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lpm2;->o:Ljava/lang/CharSequence;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v1, ", "

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    iget-object v2, p0, Lpm2;->p:Ljava/lang/CharSequence;

    .line 17
    .line 18
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    iget-object p0, p0, Lpm2;->q:Ljava/lang/CharSequence;

    .line 25
    .line 26
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lpm2;->b()Landroid/media/MediaDescription;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0, p1, p2}, Landroid/media/MediaDescription;->writeToParcel(Landroid/os/Parcel;I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
