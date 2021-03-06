package com.vanillaplacepicker.data.common

import com.vanillaplacepicker.data.GeoCoderAddressResponse
import com.vanillaplacepicker.data.VanillaAddress

object AddressMapperGoogleMap : BaseMapper<GeoCoderAddressResponse, VanillaAddress>() {

    override fun map(oldItem: GeoCoderAddressResponse): VanillaAddress {
        return VanillaAddress().apply {
            this.formattedAddress = oldItem.addressLine
            this.name = oldItem.featureName
            this.latitude = oldItem.latitude
            this.longitude = oldItem.longitude
            this.postalCode = oldItem.postalCode
            this.countryCode = oldItem.postalCode
            this.countryName = oldItem.countryName
        }
    }
}